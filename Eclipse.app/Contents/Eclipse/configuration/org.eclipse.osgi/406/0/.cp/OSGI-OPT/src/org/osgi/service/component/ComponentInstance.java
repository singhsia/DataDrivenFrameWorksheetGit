/*******************************************************************************
 * Copyright (c) Contributors to the Eclipse Foundation
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
 *
 * SPDX-License-Identifier: Apache-2.0 
 *******************************************************************************/

package org.osgi.service.component;

import org.osgi.annotation.versioning.ProviderType;

/**
 * A ComponentInstance encapsulates a component instance of an activated
 * component configuration. ComponentInstances are created whenever a component
 * configuration is activated.
 * <p>
 * ComponentInstances are never reused. A new ComponentInstance object will be
 * created when the component configuration is activated again.
 * 
 * @param <S> Type of Service
 * @ThreadSafe
 * @author $Id: 306895d0b123fde21f9d82582b0de5858ba1d014 $
 */
@ProviderType
public interface ComponentInstance<S> {
	/**
	 * Dispose of the component configuration for this component instance. The
	 * component configuration will be deactivated. If the component
	 * configuration has already been deactivated, this method does nothing.
	 */
	public void dispose();

	/**
	 * Returns the component instance of the activated component configuration.
	 * 
	 * @return The component instance or {@code null} if the component
	 *         configuration has been deactivated.
	 */
	public S getInstance();
}
