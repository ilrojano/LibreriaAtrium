/**
 * 
 */
package com.grupoatrium.persistencia.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.grupoatrium.modelo.Autor;

/**
 * @author ilr00819
 *
 */
public class AutorDAOTest {

	NamedParameterJdbcTemplate plantillaAutor;
	RowMapper<Autor> rowmapperAutor;
	/**
	 * devuelve el autor que coincide con el nombre
	 * @param nombre
	 * @return
	 */
	public Autor findAutor(String nombre){
		final String SQL_FIND_AUTOR="select * from autor where nombre=:aut";
		Map<String,String> propiedades= new HashMap<String,String>();
		propiedades.put("aut", nombre);
		return plantillaAutor.queryForObject(SQL_FIND_AUTOR, propiedades, rowmapperAutor);
	}
	/**
	 * encontrar todos los autores
	 * @return
	 */
	public List<Autor> findAllAutor(){
		final String SQL_ALL_AUTORES="SELECT * FROM AUTOR ";
		return (List<Autor>) plantillaAutor.query(SQL_ALL_AUTORES,  rowmapperAutor);
		
		
	}

	/**
	 * @return the plantillaAutor
	 */
	public NamedParameterJdbcTemplate getPlantillaAutor() {
		return plantillaAutor;
	}

	/**
	 * @param plantillaAutor the plantillaAutor to set
	 */
	public void setPlantillaAutor(NamedParameterJdbcTemplate plantillaAutor) {
		this.plantillaAutor = plantillaAutor;
	}

	/**
	 * @return the rowmapperAutor
	 */
	public RowMapper<Autor> getRowmapperAutor() {
		return rowmapperAutor;
	}

	/**
	 * @param rowmapperAutor the rowmapperAutor to set
	 */
	public void setRowmapperAutor(RowMapper<Autor> rowmapperAutor) {
		this.rowmapperAutor = rowmapperAutor;
	}
	
	

}

