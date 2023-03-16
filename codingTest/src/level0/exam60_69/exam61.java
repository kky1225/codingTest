package level0.exam60_69;

/*
 * 문제 이름 : 중복된 문자 제거
 * 문제 설명 : 머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다. 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다. 문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요. 모스부호는 다음과 같습니다.
morse = { 
    '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
    '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
    '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
    '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
    '-.--':'y','--..':'z'
}
 * 입출력 예 : .... = h, . = e, .-.. = l, .-.. = l, --- = o 따라서 "hello"를 return 합니다.
 * 입출력 예 : .--. = p, -.-- = y, - = t, .... = h, --- = o, -. = n 따라서 "python"을 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120838
 * 
 * */
public class exam61 {

	// 내 풀이
	public String solution(String letter) {
		StringBuilder answer = new StringBuilder();
		String[] arrLetter = new String[26];
		
		arrLetter = letter.split(" ");
		
		for(int i=0; i<arrLetter.length; i++) {
			answer.append(morseDecoding(arrLetter[i]));
		}
		
		
        return answer.toString();
	}
	
	public String morseDecoding(String letter) {
		String deLetter = "";
		
		switch (letter) {
			case ".-": {
				deLetter = "a";
				break;
			}case "-...": {
				deLetter = "b";
				break;
			}case "-.-.": {
				deLetter = "c";
				break;
			}case "-..": {
				deLetter = "d";
				break;
			}case ".": {
				deLetter = "e";
				break;
			}case "..-.": {
				deLetter = "f";
				break;
			}case "--.": {
				deLetter = "g";
				break;
			}case "....": {
				deLetter = "h";
				break;
			}case "..": {
				deLetter = "i";
				break;
			}case ".---": {
				deLetter = "j";
				break;
			}case "-.-": {
				deLetter = "k";
				break;
			}case ".-..": {
				deLetter = "l";
				break;
			}case "--": {
				deLetter = "m";
				break;
			}case "-.": {
				deLetter = "n";
				break;
			}case "---": {
				deLetter = "o";
				break;
			}case ".--.": {
				deLetter = "p";
				break;
			}case "--.-": {
				deLetter = "q";
				break;
			}case ".-.": {
				deLetter = "r";
				break;
			}case "...": {
				deLetter = "s";
				break;
			}case "-": {
				deLetter = "t";
				break;
			}case "..-": {
				deLetter = "u";
				break;
			}case "...-": {
				deLetter = "v";
				break;
			}case ".--": {
				deLetter = "w";
				break;
			}case "-..-": {
				deLetter = "x";
				break;
			}case "-.--": {
				deLetter = "y";
				break;
			}case "--..": {
				deLetter = "z";
				break;
			}
		}
		
		return deLetter;
	}
	
	// 남의 풀이
	/* public String solution(String letter) {
	    String answer = "";
        Map<String, String> morse = new HashMap<>(){
            {
                put(".-","a");
                put("-...","b");
                put("-.-.","c");
                put("-..","d");
                put(".","e");
                put("..-.","f");
                put("--.","g");
                put("....","h");
                put("..","i");
                put(".---","j");
                put("-.-","k");
                put(".-..","l");
                put("--","m");
                put("-.","n");
                put("---","o");
                put(".--.","p");
                put("--.-","q");
                put(".-.","r");
                put("...","s");
                put("-","t");
                put("..-","u");
                put("...-","v");
                put(".--","w");
                put("-..-","x");
                put("-.--","y");
                put("--..","z");
            }
        };
        String[] letters = letter.split(" ");
        for(String str : letters){
            answer += morse.get(str);
        }
        return answer;
	} */
	
	// 남의 풀이
	/* public String solution(String letter) {
	    String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] word = letter.split(" ");

        for(int i=0;i<word.length;i++){
            for(int j=0;j<morse.length;j++){
                if(word[i].equals(morse[j])) answer+=(char)(j+97);
            }
        }

        return answer;
	} */
	
}
