package com.univocity.parsers.annotations;

import java.lang.reflect.*;

/**
 * A transformer of headers used in {@link Nested} attributes. Used to reassign header names/indexes of
 * attributes of a {@link Nested} class which is useful when multiple {@link Nested} attributes of the same type are
 * used within a class. For example, consider the {@code Wheel} class defined as:
 *
 * <hr><blockquote><pre><code>
 * public class Wheel {
 *     @Parsed
 *     String brand;
 *
 *     @Parsed
 *     int miles;
 * }
 *  </code></pre></blockquote><hr>
 *
 * And a {@code Car} which has four {@code Wheels}:
 *
 * <hr><blockquote><pre><code>
 * public static class Car {
 * 		@Nested
 * 		Wheel frontLeft;
 *
 * 		@Nested
 * 		Wheel frontRight;
 *
 * 		@Nested
 * 		Wheel rearLeft;
 *
 * 		@Nested
 * 		Wheel rearRight;
 * }
 *  </code></pre></blockquote><hr>
 *
 * The {@code HeaderTransformer} allows us to "rename" the attributes of each different {@code Wheel} of the {@code Car}
 * so that input columns can be assigned to the appropriate places.
 *
 * Assuming an input with headers {@code frontLeftWheelBrand,frontLeftWheelMiles,frontRightWheelBrand,frontRightWheelMiles,rearLeftWheelBrand,rearLeftWheelMiles,rearRightWheelBrand,rearRightWheelMiles},
 * a {@code HeaderTransformer} can be created like this to assign a prefix in front of the header names derived from {@code Wheel} (originally just "brand" and "miles"):
 *
 * <hr><blockquote><pre><code>
 * public static class PrefixTransformer extends HeaderTransformer {
 *
 * 		private String prefix;
 *
 * 		public PrefixTransformer(String... args) {
 * 			prefix = args[0];
 * 		}
 *
 * 		@Override
 * 		public String transformName(Field field, String name) {
 * 			return prefix + Character.toUpperCase(name.charAt(0)) + name.substring(1);
 * 		}
 * }
 * </code></pre></blockquote><hr>
 *
 * This allows us to to define the {@code Car} class as:
 *
 * <hr><blockquote><pre><code>
 * public static class Car {
 * 		@Nested(headerTransformer = PrefixTransformer.class, args = "frontLeftWheel")
 * 		Wheel frontLeft;
 *
 * 		@Nested(headerTransformer = PrefixTransformer.class, args = "frontRightWheel")
 * 		Wheel frontRight;
 *
 * 		@Nested(headerTransformer = PrefixTransformer.class, args = "rearLeftWheel")
 * 		Wheel rearLeft;
 *
 * 		@Nested(headerTransformer = PrefixTransformer.class, args = "rearRightWheel")
 * 		Wheel rearRight;
 * }
 * </code></pre></blockquote><hr>
 *
 * The above annotation will prefix the {@code frontLeft} fields ("brand" and "miles") with "frontLeftWheel", effectively
 * forming the header "frontLeftWheelBrand" and "frontLeftWheelMiles", which will match the input headers and assign the
 * correct values to the correct {@code Wheel} instance.
 *
 * <strong>IMPORTANT</strong> It is mandatory to define a constructor that takes {@code String[]} as a parameter. The actual
 * parameter values come from {@link Nested#args()} to allow custom configuration of the concrete {@code HeaderTransformer} instance.
 *
 * @author uniVocity Software Pty Ltd - <a href="mailto:dev@univocity.com">dev@univocity.com</a>
 */
public abstract class HeaderTransformer {

	/**
	 * Transforms a header name
	 *
	 * @param field the field of a {@link Nested} class whose header will be transformed
	 * @param name  the current header name associated with the field of the {@link Nested} class
	 *
	 * @return the transformed header name to be used to read/write values from/to the given field.
	 */
	public String transformName(Field field, String name) {
		return name;
	}

	/**
	 * Transforms a header index
	 *
	 * @param field the field of a {@link Nested} class whose header will be transformed
	 * @param index the current column position associated with the field of the {@link Nested} class
	 *
	 * @return the transformed position to be used to read/write values from/to the given field.
	 */
	public int transformIndex(Field field, int index) {
		return index;
	}
}
