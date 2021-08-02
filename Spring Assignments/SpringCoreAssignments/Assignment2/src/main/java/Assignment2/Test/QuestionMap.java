package Assignment2.Test;

import java.util.Map;

public class QuestionMap {
	int questionId;
	String question;

	Map<Integer, String> answers;

	public QuestionMap(int questionId, String question, Map<Integer, String> answers) {
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}

	public void printQuestionAnswer() {
		System.out.println("Question Id: " + questionId);
		System.out.println("Question: " + question);
		System.out.println("Answer: " + answers);
	}
}
