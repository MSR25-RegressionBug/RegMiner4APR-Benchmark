/*
 * Copyright 2018 Google Inc.
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

package com.google.template.soy.msgs;

import com.google.common.collect.ImmutableList;
import com.google.common.io.BaseEncoding;
import com.google.common.primitives.Longs;

/**
 * Helper class to facilitate handling of message IDs created using the Soy <code>msgWithId</code>
 * function.
 *
 * <p>See go/soy-text-auditing for more details on Soy text auditing.
 */
public final class SoyMsgIdConverter {

  /**
   * Converts received message ID strings, as rendered by the Soy <code>msgId</code> function, into
   * a list of long message IDs.
   *
   * <p>The message IDs are generated by Soy as Base64 web safe ("base64url")-encoded int64s.
   *
   * <p>For example, "URTo5tnzILU=" = [0x51 0x14 0xe8 0xe6 0xd9 0xf3 0x20 0xb5] = 0x5114e8e6d9f320b5
   * = 5842550694803087541.
   *
   * @throws IllegalArgumentException if any of the strings fails to decode into message IDs, is too
   *     long or too short.
   */
  public static ImmutableList<Long> convertSoyMessageIdStrings(Iterable<String> encodedIds) {
    ImmutableList.Builder<Long> messageIds = ImmutableList.builder();
    for (String encodedId : encodedIds) {
      byte[] decodedBytes = BaseEncoding.base64Url().decode(encodedId);
      if (decodedBytes.length != Long.BYTES) {
        throw new IllegalArgumentException(
            String.format(
                "The message ID to decode ('%s') was of invalid size (%d != %d)",
                encodedId, decodedBytes.length, Long.BYTES));
      }
      messageIds.add(Longs.fromByteArray(decodedBytes));
    }
    return messageIds.build();
  }

  private SoyMsgIdConverter() {} // Do not construct
}
