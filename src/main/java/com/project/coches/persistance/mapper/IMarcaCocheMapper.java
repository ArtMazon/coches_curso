package com.project.coches.persistance.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.project.coches.domain.pojo.MarcaCochePojo;
import com.project.coches.persistance.entity.MarcaCocheEntity;

@Mapper(componentModel = "spring")
public interface IMarcaCocheMapper {
	
	/**
	 * Convierte una entity a un pojo 
	 * @param marcaEntitiy entity a convertir
	 * @return Pojo convertido
	 */
	@Mapping(source = "id", target = "id")
	@Mapping(source = "description", target = "description")
	MarcaCochePojo toMarcaCochePojo(MarcaCocheEntity marcaEntity);
	
	/**
	 * Convierte un pojo a una entity
	 * @param marcaPojo pojo a convertir
	 * @return Entity convertido
	 */
	
	@InheritInverseConfiguration
	MarcaCocheEntity toMarcaCocheEntity(MarcaCochePojo marcaPojo);
	
	/**
	 * Retorna una lista de marcas coches transformada a pojo de una lista de entidades
	 * @param marcasCocheEntity Entidad a transformar
	 * @return Lista transformada
	 */
	
	List<MarcaCochePojo> toMarcasCochePojo(List<MarcaCocheEntity> marcasCocheEntity);

}
