package com.br.fidel.tools;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.apache.http.HttpException;

import com.br.fidel.model.LocalEntrega;
import com.google.gson.Gson;
import com.google.gson.JsonObject;


public class EnderecoTools {

	public static final String URL_CORREIOS = "https://viacep.com.br/ws/";
	
	
	public JsonObject getEndereco (String cep) throws IOException, InterruptedException {
		
		URI endereco = URI.create(URL_CORREIOS+cep+"/json");
		
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(endereco).build();
		
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		String json = response.body();
		 
		JsonObject end = new Gson().fromJson(json, JsonObject.class);
	
		return end;
	}
	
	public LocalEntrega enderecoParse (JsonObject jo) {
		LocalEntrega end = new LocalEntrega();
		end.setLogradouro(jo.get("logradouro").getAsString());
		end.setBairro(jo.get("bairro").getAsString());
		end.setCidade(jo.get("localidade").getAsString());
		end.setEstado(jo.get("uf").getAsString());
		end.setCep(jo.get("cep").getAsString());
		
		return end;
	}
	
	/**
	public static void main(String[] args) throws IOException, InterruptedException, HttpException {
		EnderecoTools et = new EnderecoTools();
		JsonObject j = et.getEndereco("21221210"); 
		LocalEntrega end = et.enderecoParse(j);
		
		System.out.println("BODY: "+j);
		System.out.println("ENDERECO: "+end);
	
	}
	*/
}
