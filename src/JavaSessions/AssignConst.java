package JavaSessions;

import java.lang.reflect.Array;

public class AssignConst {

	String browserName;
	String vendorName;
	int currentVersion;
	String [] plugins;
	
		public AssignConst(String browserName, String vendorName,
		int currentVersion, String[] plugins) {
			
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		this.plugins = plugins;
	}

		public String getBrowserName() {
			return browserName;
		}

		public void setBrowserName(String browserName) {
			this.browserName = browserName;
		}

		public String getVendorName() {
			return vendorName;
		}

		public void setVendorName(String vendorName) {
			this.vendorName = vendorName;
		}

		public int getCurrentVersion() {
			return currentVersion;
		}

		public void setCurrentVersion(int currentVersion) {
			this.currentVersion = currentVersion;
		}

		public String[] getPlugins() {
			return plugins;
		}

		public void setPlugins(String[] plugins) {
			this.plugins = plugins;
		}

		public static void main(String[] args) {
			
			
	}

}
