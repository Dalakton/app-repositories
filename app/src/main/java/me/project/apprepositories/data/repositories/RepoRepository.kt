package me.project.apprepositories.data.repositories

import kotlinx.coroutines.flow.Flow
import me.project.apprepositories.data.model.Repo

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}