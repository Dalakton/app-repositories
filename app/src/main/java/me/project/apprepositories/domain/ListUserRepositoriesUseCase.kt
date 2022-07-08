package me.project.apprepositories.domain

import kotlinx.coroutines.flow.Flow
import me.project.apprepositories.core.UseCase
import me.project.apprepositories.data.model.Repo
import me.project.apprepositories.data.repositories.RepoRepository

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}