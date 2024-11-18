package resultService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import resultEntity.Result_Entity;
import resultRepository.Result_Repository;

@Service
public class Result_Service {
	@Autowired
    private Result_Repository resultRepository;

    public Result_Entity calculateResult(String rollNumber, int marks) {
        String status = marks >= 40 ? "pass" : "fail";
        Result_Entity result = new Result_Entity();
        result.setRollNumber(rollNumber);
        result.setStatus(status);
        return resultRepository.save(result);
}
}