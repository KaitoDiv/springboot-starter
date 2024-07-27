package com.example.tmpl.ctrl;import com.example.tmpl.svc.MemberSvc;import java.util.Map;import org.springframework.web.bind.annotation.DeleteMapping;import org.springframework.web.bind.annotation.GetMapping;import org.springframework.web.bind.annotation.PostMapping;import org.springframework.web.bind.annotation.RequestBody;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RequestParam;import org.springframework.web.bind.annotation.RestController;@RestController@RequestMapping("/member")public class MemberCtrl {    private final MemberSvc memberSvc;    public MemberCtrl(MemberSvc memberSvc) {        this.memberSvc = memberSvc;    }    @GetMapping("/hello")    public String hello() {        return "hello";    }    @PostMapping("/insert")    public void insert(@RequestBody Map<String, Object> req) {        memberSvc.insert(req);    }    @GetMapping("/selById")    public Map<String, Object> selById(@RequestParam Map<String, Object> params) {        return memberSvc.selById(params);    }    @PostMapping("/upById")    public void upById(@RequestBody Map<String, Object> req) {        memberSvc.upById(req);    }    @DeleteMapping("/delById")    public void delById(@RequestParam Map<String, Object> params) {        memberSvc.delById(params);    }}