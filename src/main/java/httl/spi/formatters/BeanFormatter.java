/*
 * Copyright 2011-2013 HTTL Team.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package httl.spi.formatters;

import httl.spi.Codec;
import httl.spi.Formatter;

/**
 * BeanFormatter. (SPI, Singleton, ThreadSafe)
 * 
 * @see httl.spi.parsers.AbstractParser#setFormatter(Formatter)
 * 
 * @author Liang Fei (liangfei0201 AT gmail DOT com)
 */
public class BeanFormatter implements Formatter<Object> {

	private Codec defaultCodec;

	public void setDefaultCodec(Codec defaultCodec) {
		this.defaultCodec = defaultCodec;
	}

	public String toString(String key, Object value) {
		return defaultCodec.toString(key, value);
	}

	public char[] toChars(String key, Object value) {
		return defaultCodec.toChars(key, value);
	}

	public byte[] toBytes(String key, Object value) {
		return defaultCodec.toBytes(key, value);
	}

}
