import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup} from "@angular/forms";
import {Topo} from "../../../../model/topo";
import {TopoService} from "../../../services/topo/topo.service";
import {DepartmentService} from "../../../services/department/department.service";
import {Department} from "../../../../model/department";
import {User} from "../../../../model/user";
import {Router} from "@angular/router";

@Component({
  selector: 'app-create-topo',
  templateUrl: './create-topo.component.html',
  styleUrls: ['./create-topo.component.css']
})
export class CreateTopoComponent implements OnInit {

  forms: FormGroup;
  topo: Topo;
  user: User;
  department: Department;
  departments: Department;



  constructor(private topoService: TopoService, private departmentService :DepartmentService, private formBuilder: FormBuilder,
              private router: Router){
  }

  ngOnInit() {
    this.initForm();
    this.initDepartmentList();
  }


  saveTopo() {
    this.topoService.saveTopo(this.forms)
      .subscribe(
        response => {
          this.router.navigateByUrl("/topo/view-topo/"+response.id)
          console.log("response: ", response);
        },
        err => {
          console.log("erro: ", err.error.message);
        })

  }

  private initForm() {
    this.forms = this.formBuilder.group({
      name: new FormControl(),
      department : new FormControl(),
      user: new FormControl(),
    });
  }

  private initDepartmentList() {
    this.departmentService.getDepartments().subscribe(
      res =>
      {
        this.departments = res;
      }
    );
  }

}
