package com.jimmy.aumentadordevocabularioapp.data

import com.jimmy.aumentadordevocabularioapp.R
import com.jimmy.aumentadordevocabularioapp.model.VocabularyLessons

class Datasource {
    fun loadLessons(): List<VocabularyLessons> {
        return listOf<VocabularyLessons>(
            VocabularyLessons(R.drawable.vocabbulider_1a),
            VocabularyLessons(R.drawable.al_1),
            VocabularyLessons(R.drawable.al_2a),
            VocabularyLessons(R.drawable.ance),
            VocabularyLessons(R.drawable.ant_1),
            VocabularyLessons(R.drawable.ar),
            VocabularyLessons(R.drawable.ary),
            VocabularyLessons(R.drawable.able),
            VocabularyLessons(R.drawable.ct),
            VocabularyLessons(R.drawable.ence),
            VocabularyLessons(R.drawable.ent),
            VocabularyLessons(R.drawable.gy),
            VocabularyLessons(R.drawable.ic),
            VocabularyLessons(R.drawable.ical),
            VocabularyLessons(R.drawable.id),
            VocabularyLessons(R.drawable.ism),
            VocabularyLessons(R.drawable.ist),
            VocabularyLessons(R.drawable.ive),
            VocabularyLessons(R.drawable.ment),
            VocabularyLessons(R.drawable.or),
            VocabularyLessons(R.drawable.ory),
            VocabularyLessons(R.drawable.ous),
            VocabularyLessons(R.drawable.sion),
            VocabularyLessons(R.drawable.sis),
            VocabularyLessons(R.drawable.tion),
            VocabularyLessons(R.drawable.ty)
        )
    }
}