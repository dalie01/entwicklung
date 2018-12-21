package english;

import java.io.File;

//import com.gtranslate.Language;
//import com.gtranslate.Translator;

public class OneDrive extends Task {
	
	@Override
	void execute() throws Exception {
		
	}
	
	@Override
	void execute(Explorer ex) throws Exception {
		synchronized (this) {
	
			if (ex.sFolder.exists()) { 
				
				if(ex.prepareTargetFolder(ex.tFolder)) {
					
					for(File fileFromSource : ex.getFilesListOfFolder(ex.sFolder)) {
						
						if(ex.isFileSkipped(fileFromSource)) {
							continue;
							
						} else	
						
							if (ex.prepareTargetFolder (
									ex.getTargetFolder(fileFromSource.getName()))) {
							
									Explorer.copyFile(fileFromSource, ex.getTargetFile(fileFromSource.getName()));
									//Explorer.writeFile(ex.getTargetDescriptionFile(fileFromSource.getName(), Translator.getInstance().translate(ex.getNewTargetFolderName(fileFromSource.getName()), Language.ENGLISH, Language.GERMAN)));
							}
					}
				}
					
			} else 
				throw new Exception("SourceFolder not Exist");
			
		}
	}
}
