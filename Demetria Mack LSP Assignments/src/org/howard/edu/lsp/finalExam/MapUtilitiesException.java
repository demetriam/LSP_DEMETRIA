package org.howard.edu.lsp.finalExam;

public class MapUtilitiesException extends NullPointerException {
	

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public MapUtilitiesException(String errorMsg){		
			super("One or both maps are null");
		}
		


}
