/*
 * Copyright (C) 2016 akha, a.k.a. Alexander Kharitonov
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

package akha.func.analyse;

import android.content.Context;
import android.util.Log;

/**
 * Class description stub.
 *
 * @author akha
 */
public class Analyser {

    protected int x;

    /** @exclude */
    protected int xSecret;

    /**
     * Method description stub.
     *
     * @param context The {@link Context} analyser is running in.
     */
    public static void init(Context context) {
        Log.i("tag", context.getString(akha.func.analyse.R.string.hi));
        //Log.i("tag", "no flavors");
    }

    /**
     * One more stub.
     */
    protected void init2() {
    }

    /** @exclude and more text */
    public void run() {
    }

    private void run2() {
    }
}
