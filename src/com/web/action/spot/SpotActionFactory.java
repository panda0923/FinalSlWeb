package com.web.action.spot;


import com.web.web.WebUtil;
import com.web.web.action.Action;
import com.web.web.action.ActionFactory;

public class SpotActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		Action action = null;
		if("insert".equals(actionName)){
			action = new EntInsertAction();
		}else if("delete".equals(actionName)){
			action  = new EntDeleteAction();
		}else if("update".equals(actionName)){
			action = new EntUpdateAction();
		}else if("search".equals(actionName)){
			action = new EntSearchAction();
		}else{
			// WebUtil.redirect(response, "/mysite/Member?a=joinsueccess");
		}
		return action;
	}

}
