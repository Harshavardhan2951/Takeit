package com.Practice.Exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @GetMapping
    public String showFeedbackForm(Model model) {
        model.addAttribute("feedback", new Feedback());
        return "feedback-form";
    }

    @PostMapping
    public String submitFeedback(Feedback feedback) {
        FeedbackEntity feedbackEntity = new FeedbackEntity();
        feedbackEntity.setName(feedback.getName());
        feedbackEntity.setEmail(feedback.getEmail());
        feedbackEntity.setMessage(feedback.getMessage());

        feedbackRepository.save(feedbackEntity);

        return "feedback-success";
    }
}
