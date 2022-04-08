package com.example.job.data

import com.example.job.R
import com.example.job.model.Job

class Datasource {

    fun loadJob(): List<Job> {
        return listOf<Job>(
            Job(R.string.job1, R.drawable.image_1, R.string.desc1),
            Job(R.string.job2, R.drawable.image_2, R.string.desc1),
            Job(R.string.job3, R.drawable.image_3, R.string.desc1),
            Job(R.string.job4, R.drawable.image_4, R.string.desc1),
            Job(R.string.job5, R.drawable.image_5, R.string.desc1),
            Job(R.string.job6, R.drawable.image_6, R.string.desc1),
            Job(R.string.job7, R.drawable.image_7, R.string.desc1),
            Job(R.string.job8, R.drawable.image_8, R.string.desc1),
            Job(R.string.job9, R.drawable.image_9, R.string.desc1),
            Job(R.string.job10, R.drawable.image_10, R.string.desc1)
        )
    }
}