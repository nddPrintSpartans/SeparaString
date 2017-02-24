package test;

import static org.junit.Assert.fail;
import static org.junit.Assert.*;

import org.junit.Test;

import SeparaString.SeparaString;


public class SeparaStringTest {

	@Test
	public void Deve_retornar_2_campos() {
		String conteudo ="teste|abc" ;
		SeparaString separador = new SeparaString();
		String[] expected = new String []{"teste", "abc"};
		String [] campos = separador.split( conteudo, "|");

		assertArrayEquals(expected, campos);
	}
	@Test
	public void Deve_retornar_3_campos() {
		String conteudo ="teste|abc|lages" ;
		SeparaString separador = new SeparaString();
		String[] expected = new String []{"teste", "abc", "lages"};
		String [] campos = separador.split( conteudo, "|");

		assertArrayEquals(expected, campos);
	}

	@Test
	public void Deve_retornar_1_campos() {
		String conteudo ="teste" ;
		SeparaString separador = new SeparaString();
		String[] expected = new String []{"teste"};
		String [] campos = separador.split( conteudo, "|");

		assertArrayEquals(expected, campos);
	}


	@Test
	public void Deve_retornar_4_campos_identificador_duplo() {
		String conteudo ="teste#%2#%3#%4" ;
		SeparaString separador = new SeparaString();
		String[] expected = new String []{"teste" , "2", "3", "4"};
		String [] campos = separador.split( conteudo, "#%");

		assertArrayEquals(expected, campos);
	}

	@Test
	public void Deve_retornar_3campos() {
		String conteudo ="teste#%#%nddPrint" ;
		SeparaString separador = new SeparaString();
		String[] expected = new String []{"teste", "", "nddPrint" };
		String [] campos = separador.split( conteudo, "#%");

		assertArrayEquals(expected, campos);
	}

	@Test
	public void Deve_retornar_2campos_com_delimitador_no_final() {
		String conteudo ="teste#%" ;
		SeparaString separador = new SeparaString();
		String[] expected = new String []{"teste", "" };
		String [] campos = separador.split( conteudo, "#%");

		assertArrayEquals(expected, campos);
	}

	@Test
	public void Deve_retornar_2campos_com_delimitador_no_inicio() {
		String conteudo ="#%teste" ;
		SeparaString separador = new SeparaString();
		String[] expected = new String []{"","teste" };
		String [] campos = separador.split( conteudo, "#%");

		assertArrayEquals(expected, campos);
	}

	@Test
	public void Deve_retornar_3campos_vazios() {
		String conteudo ="#%#%" ;
		SeparaString separador = new SeparaString();
		String[] expected = new String []{"","","" };
		String [] campos = separador.split( conteudo, "#%");

		assertArrayEquals(expected, campos);
	}

	@Test
	public void Deve_retornar_3campos_parte_delimitador_no_campo() {
		String conteudo ="Guilherme#%Nddprint%lages#%guistyle@ndd.com.br" ;
		SeparaString separador = new SeparaString();
		String[] expected = new String []{"Guilherme","Nddprint%lages","guistyle@ndd.com.br" };
		String [] campos = separador.split( conteudo, "#%" );

		assertArrayEquals(expected, campos);
	}

}
