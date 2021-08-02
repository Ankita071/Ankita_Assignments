package Assignment2.Test;

import java.util.List;

public class QuestionList {
	int questionId;
	String question;

	List<String> answers;

	public QuestionList(int questionId, String question, List<String> answers) {
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
