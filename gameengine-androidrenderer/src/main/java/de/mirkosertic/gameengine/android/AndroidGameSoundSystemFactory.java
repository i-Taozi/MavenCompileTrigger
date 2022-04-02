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
package de.mirkosertic.gameengine.android;

import android.content.res.AssetManager;
import de.mirkosertic.gameengine.core.GameRuntime;
import de.mirkosertic.gameengine.sound.GameSoundSystem;
import de.mirkosertic.gameengine.sound.GameSoundSystemFactory;

public class AndroidGameSoundSystemFactory implements GameSoundSystemFactory<AndroidStreamIdentifier> {

    private final AssetManager assetManager;

    AndroidGameSoundSystemFactory(AssetManager aAssetManager) {
        assetManager = aAssetManager;
    }

    @Override
    public GameSoundSystem<AndroidStreamIdentifier> create(GameRuntime aGameRuntime) {
        return new AndroidGameSoundSystem(aGameRuntime.getResourceCache());
    }
}
