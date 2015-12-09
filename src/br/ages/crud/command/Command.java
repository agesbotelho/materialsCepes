package br.ages.crud.command;

import java.sql.SQLException;
import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import br.ages.crud.exception.NegocioException;
import br.ages.crud.exception.PersistenciaException;

/**
 * Interface que implementa o Designer Partner Command (GoF)
 * 
 * @author C�ssio Trindade
 *
 */
public interface Command {
	/**
	 * execu��o de comando dos request das telas.
	 * @param request
	 * @return
	 * @throws SQLException 
	 * @throws ParseException 
	 * @throws PersistenciaException 
	 * @throws NegocioException
	 */


	public String execute(HttpServletRequest request) throws SQLException, PersistenciaException, ParseException, NegocioException;
}
