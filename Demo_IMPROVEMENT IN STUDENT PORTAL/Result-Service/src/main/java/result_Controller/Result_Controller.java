package result_Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import resultEntity.Result_Entity;
import resultService.Result_Service;

@RestController
@RequestMapping("/results")
public class Result_Controller {
	@Autowired
    private Result_Service resultService;

    @PostMapping
    public ResponseEntity<Result_Entity> calculateResult(@RequestBody Map<String, Object> studentData) {
        String rollNumber = (String) studentData.get("rollNumber");
        int marks = (int) studentData.get("marks");
        return new ResponseEntity<>(resultService.calculateResult(rollNumber, marks), HttpStatus.CREATED);
}
}
