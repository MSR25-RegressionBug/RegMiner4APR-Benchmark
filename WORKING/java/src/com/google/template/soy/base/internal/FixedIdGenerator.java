/*
 * Copyright 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.template.soy.base.internal;

/**
 * A generator of fixed ids.
 *
 * <p>Important: Do not use outside of Soy code (treat as superpackage-private).
 *
 */
public final class FixedIdGenerator implements IdGenerator {

  /** The default fixed id is 0. */
  private static final int DEFAULT_FIXED_ID = 0;

  /** The fixed id value generated by this instance. */
  private final int fixedId;

  /**
   * Constructor that takes a value for the fixed id to be generated.
   *
   * @param fixedId The value for the fixed id to be generated.
   */
  public FixedIdGenerator(int fixedId) {
    this.fixedId = fixedId;
  }

  /**
   * Constructor that does not take a value for the fixed id to be generated. The fixed id value
   * will be 0.
   */
  public FixedIdGenerator() {
    this(DEFAULT_FIXED_ID);
  }

  @Override
  public int genId() {
    return fixedId;
  }

  @Override
  public FixedIdGenerator copy() {
    return new FixedIdGenerator(fixedId);
  }
}