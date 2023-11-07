/*
 * Designed and developed by 2023 skydoves (Jaewoong Eum)
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
package com.skydoves.orbital.benchmark.app.profiles

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.SpringSpec
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize

val transformationSpec = SpringSpec<IntSize>(
  dampingRatio = Spring.DampingRatioMediumBouncy,
  stiffness = 200f,
)

val movementSpec = SpringSpec<IntOffset>(
  dampingRatio = Spring.DampingRatioMediumBouncy,
  stiffness = 200f,
)
