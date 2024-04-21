package com.test.myproject.presentation.utilities.dataTrasnferObject


internal interface ValidationService<Dto, Model> {
    fun validate(block: ValidationState<Model>.() -> Unit)
    fun mapToDomainModel(): Model
}