package dalieOCP.filesAndDirectoryAttributes.UserDefinedFileAttributeView;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Map;

class Execute {
	
	public static void main(String[] args) throws IOException {
		
		Path dire = Paths.get("source\\dalieOCP\\fileAndDirectoryAttributes");
		Path file = Paths.get("Execute.txt");
		
		UserDefinedFileAttributeView view = Files.getFileAttributeView(dire.resolve(file), UserDefinedFileAttributeView.class);
		writeAttr(view, "hans", "HelloWorld");
			System.out.println(readAttr(view,"hans"));
		
		Map<String, Object> values = Files.readAttributes(dire.resolve(file), "lastAccessTime,lastModifiedTime");
		for(String key: values.keySet()){
			System.out.println( key + ";" + values.get(key));
		}
	}
	
	static void writeAttr(UserDefinedFileAttributeView view, String attr, String value) throws IOException {
			view.write(attr,Charset.defaultCharset().encode(value));
	}
	
	static String readAttr(UserDefinedFileAttributeView view, String attr) throws IOException {
		ByteBuffer buf = ByteBuffer.allocateDirect(view.size(attr));
		view.read(attr, buf);
		buf.flip();
		return Charset.defaultCharset().decode(buf).toString();
	}
	
}
