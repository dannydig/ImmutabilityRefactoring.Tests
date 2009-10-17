package edu.uiuc.immutability.tests;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "edu.uiuc.immutability.tests";

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
	
	public static String getPluginId() {
		return PLUGIN_ID;
	}
	
	public File getFileInPlugin(IPath path) throws CoreException {
		try {
			URL installURL= new URL(getBundle().getEntry("/"), path.toString());
			URL localURL= FileLocator.toFileURL(installURL);
			return new File(localURL.getFile());
		} catch (IOException e) {
			throw new CoreException(new Status(IStatus.ERROR, getPluginId(), IStatus.ERROR, e.getMessage(), e));
		}
	}
	
	public InputStream getTestResourceStream(String fileName) throws IOException {
		IPath path= new Path("resources").append(fileName);
		URL url= new URL(getBundle().getEntry("/"), path.toString());
		return url.openStream();
	}

}
