package SeparaString;

import java.util.ArrayList;

public class SeparaString {

	public  String[] split(String conteudo, String delimitador) {

		ArrayList list = new ArrayList();
		String campo;
		while (  (campo = getNextItem (conteudo, delimitador)) != null){
			list.add( campo);
			conteudo = conteudo.substring(campo.length() +delimitador.length());
		}
		list.add(conteudo);
		String resultado[] = new String[list.size()];
		list.toArray(resultado);
		return resultado;

	}

	private String getNextItem(String conteudo, String delimitador){

		int findIndex =  conteudo.indexOf(delimitador);
		if( findIndex != -1){
			return conteudo.substring(0,findIndex);
		}
		return null;
	}

}
