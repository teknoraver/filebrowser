package net.teknoraver.filebrowser;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.net.Uri;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		startActivity(new Intent()
			.setComponent(new ComponentName("com.android.documentsui", "com.android.documentsui.DocumentsActivity"))
			.setAction("android.provider.action.BROWSE_DOCUMENT_ROOT")
			.setData(Uri.parse("content://com.android.externalstorage.documents/root/primary"))
		);
		finish();
	}
}
