package com.ustadmobile.roommigrateissue.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class IssueEntity(
    @PrimaryKey
    var issuePk: Long = 0,
    var issueText: String? = null,
)

