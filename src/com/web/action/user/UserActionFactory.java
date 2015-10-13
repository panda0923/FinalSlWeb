package com.web.action.user;

import com.web.web.action.Action;
import com.web.web.action.ActionFactory;

public class UserActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		Action action = null;
		if("insert".equals(actionName)){
			action = new InsertAction();
		}else if("update".equals(actionName)){
			action = new UpdateAction();
		}else if("bestEmp".equals(actionName)){
			action = new BestEmpAction();
		}else if("empSerch".equals(actionName)){
			action = new EmpSerchAction();
		}else if("select".equals(actionName)){
			action = new SelectAction();
		}else if("delete".equals(actionName)){
			action = new DeleteAction();
		}
		return action;
	}

}
