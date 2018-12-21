package string;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.apache.commons.lang3.StringEscapeUtils;

import patterns.Listing.MapHandling;

public class HTMLConvert {
	public static void main(String[] args) {

		String string = "Hello a 1 ÜÄ í &nbsp; &Uuml; World";
		try {
			System.out.println(URLEncoder.encode(string, "ISO-8859-1"));
			System.out.println(URLDecoder.decode(string, "ISO-8859-1"));
			System.out.println(StringEscapeUtils.escapeHtml3(string));
			System.out.println(StringEscapeUtils.unescapeHtml3(string));
			System.out.println(MapHandling.valueOfUTF8(string));
		} catch (UnsupportedEncodingException e) {
			System.out.println(e.getMessage());
		}
	}// main
}
