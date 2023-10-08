/*
 * Unitto is a unit converter for Android
 * Copyright (c) 2023 Elshan Agaev
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.sadellie.unitto.data.model.timezone

import android.icu.util.TimeZone

/**
 * Use cached name and region properties!
 *
 * @property timeZone Same as [TimeZone]
 * @property name Cached localized [TimeZone.getDisplayName]
 * @property region Cached localized [TimeZone.getRegion]
 * @property rank Higher is better, closer to the search query
 */
data class SearchResultZone(
    val timeZone: TimeZone,
    val name: String,
    val region: String,
    val rank: Int,
)
