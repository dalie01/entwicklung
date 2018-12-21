package translate;

import java.io.InputStream;

import com.gtranslate.Audio;
import com.gtranslate.Language;
import com.gtranslate.Translator;

import translate.url.GHelper;

public class Translater {
	public static void main(String[] args) throws Exception {
		Translator translate = Translator.getInstance();
		String text = translate.translate("I am at work", Language.ENGLISH, Language.GERMAN);
		System.out.println(text);
		GHelper gHelper = new GHelper();
		try {
			gHelper.getHtmlContent();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Audio audio = Audio.getInstance();
		InputStream sound  = audio.getAudio("I am a bus", Language.ENGLISH);
		audio.play(sound);
	}
}
