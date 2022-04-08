package com.example.job.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Job(
    @StringRes val stringResourceId1: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val stringResourceId2: Int
)