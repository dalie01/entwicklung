package dalieOCP.filesAndDirectoryAttributes.AclFileAttributeView;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.List;

class Execute {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Path dire = Paths.get("source\\dalieOCP\\fileAndDirectoryAttributes");
		Path file = Paths.get("Execute.txt");
		AclFileAttributeView aclView = Files.getFileAttributeView(dire.resolve(file), AclFileAttributeView.class);
		try {
			List<AclEntry> aclS = aclView.getAcl();
		
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
