package cdl.android.ui.message;

import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

/**
* Message item
*/
public class MessageItem {
	private String author;
	private String subject;
	private String content;
	private String date;
	private String id;
	private String reply_to;

	public void parseContent(JSONObject obj) throws JSONException {
		Log.d("ceva", obj.toString());
		author = obj.getString("from");
		subject = obj.getString("subject");
		content = obj.getString("text");
		date = obj.getString("date");
		id = obj.getString("id");
		reply_to = obj.getString("reply_to");
		Log.d("reply", reply_to);
	}

	public String getAuthor() {
		return author;
	}

	public String getSubject() {
		return subject;
	}

	public String getContent() {
		return content;
	}	

	public String getDate() {
		return date;
	}
	
	public String getId() {
		return id;
	}
	
	public String getReply_to() {
		return reply_to;
	}

}


