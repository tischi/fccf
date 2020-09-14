package develop;

import de.embl.cba.fccf.devel.callback.TestCallbackCommand;
import de.embl.cba.fccf.devel.callback.TestSomeCommand;
import de.embl.cba.fccf.devel.record.TestCommand;
import ij.plugin.frame.Recorder;
import net.imagej.ImageJ;

public class DevelopMacroRecording
{
	public static void main( String[] args )
	{
		final ImageJ imageJ = new ImageJ();
		imageJ.ui().showUI();
		final Recorder recorder = new Recorder();
		imageJ.command().run( TestSomeCommand.class, true );
	}
}
