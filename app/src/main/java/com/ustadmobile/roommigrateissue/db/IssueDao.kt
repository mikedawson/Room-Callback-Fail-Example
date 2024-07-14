package com.ustadmobile.roommigrateissue.db

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
abstract class IssueDao {

    @Query("SELECT * FROM IssueEntity")
    abstract fun selectAllIssues(): List<IssueEntity>

    @Query("SELECT * FROM IssueEntity")
    abstract fun selectAllIssuesAsFlow(): Flow<List<IssueEntity>>

    @Query("SELECT * FROM IssueEntity")
    abstract fun selectAllAsPagingSource(): PagingSource<Int, IssueEntity>
}