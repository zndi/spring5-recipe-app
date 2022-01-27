package guru.springframework.map;

import guru.springframework.entity.*;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper
public interface RecipeMapper {
    RecipeMapper INSTANCE = Mappers.getMapper( RecipeMapper.class );

    Recipe toEntity(guru.springframework.model.Recipe model , @Context CycleAvoidingMappingContext context);
    guru.springframework.model.Recipe toModel(Recipe entity , @Context CycleAvoidingMappingContext context);

    Difficulty toEntity(guru.springframework.model.Difficulty model , @Context CycleAvoidingMappingContext context);
    guru.springframework.model.Difficulty toModel(Difficulty Entity , @Context CycleAvoidingMappingContext context);

    Ingredient toEntity(guru.springframework.model.Ingredient model , @Context CycleAvoidingMappingContext context);
    guru.springframework.model.Ingredient toModel(Ingredient Entity , @Context CycleAvoidingMappingContext context);

    Notes toEntity(guru.springframework.model.Notes model , @Context CycleAvoidingMappingContext context);
    guru.springframework.model.Notes toModel(Notes Entity , @Context CycleAvoidingMappingContext context);

    UnitOfMeasure toEntity(guru.springframework.model.UnitOfMeasure model , @Context CycleAvoidingMappingContext context);
    guru.springframework.model.UnitOfMeasure toModel(UnitOfMeasure Entity , @Context CycleAvoidingMappingContext context);

    Category toEntity(guru.springframework.model.Category model , @Context CycleAvoidingMappingContext context);
    guru.springframework.model.Category toModel(Category Entity , @Context CycleAvoidingMappingContext context);

    Set<Category> toEntities(Set<guru.springframework.model.Category> model , @Context CycleAvoidingMappingContext context);
    Set<guru.springframework.model.Category> toModels(Set<Category> Entity , @Context CycleAvoidingMappingContext context);

    Set<Ingredient> toEntity(Set<guru.springframework.model.Ingredient> model , @Context CycleAvoidingMappingContext context);
    Set<guru.springframework.model.Ingredient> toModel(Set<Ingredient> Entity , @Context CycleAvoidingMappingContext context);
}
