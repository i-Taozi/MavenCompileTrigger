/*
 * Copyright 2016 Mirko Sertic
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.mirkosertic.gameengine.web.github;

import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

// https://api.github.com/repos/mirkosertic/GameComposer/git/commits/36a1e4239ce45c9558505dd7e5de774d798fd5fd
public abstract class GithubCommit implements JSObject {

    public interface Userinfo extends JSObject {
        @JSProperty
        String getName();
    }

    public interface Tree extends JSObject {

        @JSProperty
        String getSha();
    }

    @JSProperty
    public abstract String getMessage();

    @JSProperty
    public abstract String getSha();

    @JSProperty
    public abstract Userinfo getAuthor();

    @JSProperty
    public abstract Userinfo getCommitter();

    @JSProperty
    public abstract Tree getTree();
}
