package com.web.web.action;

import com.web.web.action.Action;
import com.web.web.action.ActionFactory;

public class FinalActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		Action action = null;
		if("insert".equals(actionName)){
			action = new InsertAction();
		}else if("bestEmp".equals(actionName)){
			action = new BestEmp();
		}else if("select".equals(actionName)){
			action = new SelectAction();
		}else if("delete".equals(actionName)){
			action = new DeleteAction();
		}
		return action;
	}

}
