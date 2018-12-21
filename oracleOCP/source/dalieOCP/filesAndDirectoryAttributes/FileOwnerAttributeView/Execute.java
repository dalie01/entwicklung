package dalieOCP.filesAndDirectoryAttributes.FileOwnerAttributeView;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;

class Execute {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Path dire = Paths.get("source\\dalieOCP\\fileAndDirectoryAttributes");
		Path file = Paths.get("Execute.txt");
		FileOwnerAttributeView fileOwnerView = Files.getFileAttributeView(dire.resolve(file), FileOwnerAttributeView.class);
		try {
			UserPrincipal userPrincipal = fileOwnerView.getOwner();
		
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
