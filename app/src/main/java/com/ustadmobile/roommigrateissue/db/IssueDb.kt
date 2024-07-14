package com.ustadmobile.roommigrateissue.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [IssueEntity::class],
    version = 1,
)
abstract class IssueDb: RoomDatabase() {

    abstract fun issueDao(): IssueDao

}