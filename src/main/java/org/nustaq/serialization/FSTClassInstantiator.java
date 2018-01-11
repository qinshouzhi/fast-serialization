/*
 * Copyright 2014 Ruediger Moeller.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.nustaq.serialization;

import java.lang.reflect.Constructor;

/**
 * Created by ruedi on 12.12.14.
 */
public interface FSTClassInstantiator {

    Object newInstance(Class clazz, Constructor cons, boolean doesRequireInit, boolean unsafeAsLastResort);
    Constructor findConstructorForExternalize(Class clazz);
    Constructor findConstructorForSerializable(Class clazz);

}
