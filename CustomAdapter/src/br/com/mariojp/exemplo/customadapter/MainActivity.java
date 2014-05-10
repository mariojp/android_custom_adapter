package br.com.mariojp.exemplo.customadapter;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

	private ListView lista;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		List<ItemLista> itens = new ArrayList<ItemLista>();
		itens.add(new ItemLista(1l,"Titulo 1","Subtitulo 1"));
		itens.add(new ItemLista(2l,"Titulo 2","Subtitulo 2"));
		itens.add(new ItemLista(3l,"Titulo 3","Subtitulo 3"));
		itens.add(new ItemLista(4l,"Titulo 4","Subtitulo 4"));
		itens.add(new ItemLista(5l,"Titulo 5","Subtitulo 5"));
		itens.add(new ItemLista(6l,"Titulo 6","Subtitulo 6"));
		itens.add(new ItemLista(7l,"Titulo 7","Subtitulo 7"));
		itens.add(new ItemLista(8l,"Titulo 8","Subtitulo 8"));

		
		lista = (ListView) findViewById(R.id.lista);
		ItemAdapter adapter = new ItemAdapter(this, itens);
		
		lista.setAdapter(adapter);
	
	}

}
