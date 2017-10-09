/*
 * @author Kevin Singh
 *   date: October 6, 2017
 * 
 */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OpenStackMeetingsController {
	
	private OpenStackMeetingsService osmService;
	
	public OpenStackMeetingsController() {
		
	}
	
	public OpenStackMeetingsController(OpenStackMeetingsService osmService) {
		this.osmService = osmService;
	}
}


/*
@Controller
public class EmailController {

	private EditorService editorService;
	
	public EmailController() {
		
	}
	
	public EmailController(EditorService editorService) {
		this.editorService = editorService;
	}
	
	@ResponseBody
    @RequestMapping(value = "/")
    public String helloWorld()
    {
        return "Hello world!";
    }
	
	@ResponseBody
	@RequestMapping(value = "/compose")
	public String getComposedEmail() {
		return editorService.composeEmail();
	}	
	
	@ResponseBody
    @RequestMapping(value = "/", params = {"action"}, method=RequestMethod.GET)
    public String getGreeting(@RequestParam("action") String action)
    {
		String ret = "";
		if (action != null && action.equalsIgnoreCase("compose") ||
				action.equalsIgnoreCase("create")) {
			ret = editorService.composeEmail();
			editorService.thisIsVoidFunction();
		}
		return ret;
    }
	
	public String getWithGhostEditor() {
		editorService = new EnglishEditorServiceImpl();
        return editorService.composeEmail();		
	}
	
	public void setEditorService(EditorService editorService) {
		this.editorService = editorService;
	}
}
*/
