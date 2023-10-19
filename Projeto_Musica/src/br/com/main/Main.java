package br.com.main;

import java.util.Scanner;
import br.com.classes.Musica;
import br.com.classes.Podcast;
import br.com.classes.Album;
import br.com.classes.Pai;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Musica  musica = new Musica();
		Podcast  podcast = new Podcast();
		Album  album = new Album();
		Pai pai = new Pai();
        String palavraChave = "CURTI";
        String palavraChave2 = "NAO_CURTI";


		
		
		System.out.println("                  Bem Vindo(a) ao ");
		System.out.println("                      PullS ");
		System.out.println("           a musica que puxa seu eu interior");
		System.out.println("");
		System.out.println("------------------------------------------------");
		
			// PARTE MUSICA
		
		System.out.println("Agora estamos na categoria da musica!!!");
		System.out.println("coloque os dados das suas musicas aqui 👇");
		System.out.println("");
		
		System.out.println("Nome: ");
        musica.setNome(scanner.next());
       System.out.println("Artista: ");
        musica.setArtista(scanner.next());
        System.out.println("Gênero: ");
        musica.setGenero(scanner.next());
        System.out.println("Duração: ");
        musica.setDuracao(scanner.nextDouble());
        System.out.println("Se curtiu essa musica escreva: CURTI ou NÃO CURTI  ");
        while (true) {
        	String entrada = scanner.next();
        	
            
            if (entrada.equalsIgnoreCase(palavraChave) || entrada.equalsIgnoreCase(palavraChave2)) {
            	musica.setCurtidas(entrada);
                
                break; 
            } else {
                System.out.println("Ops meu consagrado!!!  😫😫");
                System.out.println("voce tem que escrever se voce cutiu ou não, Tente novamente.");
                musica.setCurtidas(scanner.nextLine());
            }
        }
     
        
        System.out.println("---------------------------------------------");
        
        //PARTE PODCAST 
        
        System.out.println("Agora estamos na categoria do podcast!!!");
        
        System.out.println("Nome: ");
        podcast.setNome(scanner.next());
       System.out.println("Artista: ");
        podcast.setArtista(scanner.next());
        System.out.println("Gênero: ");
        podcast.setGenero(scanner.next());
        System.out.println("Duração: ");
        podcast.setDuracao(scanner.nextDouble());
        System.out.println("Se curtiu essa musica escreva: CURTI ou NÃO CURTI  ");
        while (true) {
            String entrada = scanner.next();
            
            if (entrada.equalsIgnoreCase(palavraChave) || entrada.equalsIgnoreCase(palavraChave2)) {

            	podcast.setCurtidas(entrada);
            	 
                
                break; 
            } else {
                System.out.println("Ops meu consagrado!!!  😫😫");
                System.out.println("voce tem que escrever se voce cutiu ou não, Tente novamente.");
                podcast.setCurtidas(scanner.nextLine());
            }
        }
        
        System.out.println("---------------------------------------------");
        
       //PARTE ALBUM
        
        System.out.println("Agora estamos na categoria do album!!!");
        
        System.out.println("Nome: ");
        album.setNome(scanner.next());
        System.out.println("Artista: ");
        album.setArtista(scanner.next());
        System.out.println("Gênero: ");
        album.setGenero(scanner.next());
        System.out.println("Duração: ");
        album.setDuracao(scanner.nextDouble());
        System.out.println("Se curtiu essa musica escreva: CURTI ou NÃO CURTI  ");
        while (true) {
            String entrada = scanner.next();
            
            if (entrada.equalsIgnoreCase(palavraChave) || entrada.equalsIgnoreCase(palavraChave2)) {
            	 album.setCurtidas(entrada);
                
                break; 
            } else {
                System.out.println("Ops meu consagrado!!!  😫😫");
                System.out.println("voce tem que escrever se voce cutiu ou não, Tente novamente.");
                album.setCurtidas(scanner.nextLine());
            }
        }
        
        //PARTE DAS MUSICAS CURTIDAS  
        
        System.out.println("parabens");
	    System.out.println("seus favoritos aqui");
        
        musica.favorito();
        podcast.favorito();
        album.favorito();
	}
}
