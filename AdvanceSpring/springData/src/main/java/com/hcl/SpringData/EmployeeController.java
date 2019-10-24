package com.hcl.SpringData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository dao;
	int numRecords = 2;
	int numOfPage;

	@RequestMapping(value = "/")
	public ModelAndView getEmploy() {
		ModelAndView mv = new ModelAndView();
		List<Employ> listEmploy = (List<Employ>) dao.findAll();
		numOfPage = listEmploy.size() / numRecords + listEmploy.size() % numRecords;
		mv.addObject("pages", numOfPage);
		mv.addObject("listEmploy", listEmploy);
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(value = "/getName")
	public ModelAndView getEmployName() {
		ModelAndView mv = new ModelAndView();
		String employName = (String) dao.findNameByDeptAndDesign(1);
		
		mv.addObject("employName", employName);
	
		mv.setViewName("name");
		return mv;
	}

	@RequestMapping(value = "/displayjavadeveloper")
	public ModelAndView getJavaContractors() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("listEmploy", dao.findByDeptAndDesign("java", "developer"));
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping(value = "/displayjavaemploy")
	public ModelAndView getJavaEmploy() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("listEmploy", dao.findByEmployName(""));
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping(value = "/displayjavamanager")
	public ModelAndView getJavaManager() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("listEmploy", dao.findByBasic(5000));
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping(value = "/displayjavawithS")
	public ModelAndView getJavaEmployWithA() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("listEmploy", dao.findByBasicAndName(50000, ""));
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping(value = "/displayAllSortByDesign")
	public ModelAndView getAllOrder() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("listEmploy", dao.findAll(Sort.by("desig")));
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping(value = "/displayAllSortByDescending")
	public ModelAndView getAllOrderByDesc() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("listEmploy", dao.findAll(Sort.by("desig").descending()));
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping(value = "/displayAllSortByDescendingAndsortbydept")
	public ModelAndView getAllOrderByDescAndSortByDept() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("listEmploy", dao.findAll(Sort.by("basic", "dept").descending()));
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping(value = "/displayjavaemployAndsortsalaryinDesc")
	public ModelAndView getEmployAndSortBySal() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("listEmploy", dao.findAll((Sort.by("basic").descending())));
		mv.addObject("listEmploy", dao.findByDept("java"));
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping(value = "/displayAll/page/{pageno}")
	public ModelAndView displayAllSortByDesign(@PathVariable("pageno") int pageno) {
		ModelAndView mv = new ModelAndView();
		Page<Employ> pages = dao.findAll(PageRequest.of(pageno, numRecords));
		mv.addObject("pages", numOfPage);
		mv.addObject("listEmploy", (pages).getContent());
		mv.setViewName("home");
		return mv;
	}

}