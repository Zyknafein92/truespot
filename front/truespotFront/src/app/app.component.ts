import {Component, OnInit} from '@angular/core';
import {TokenStorageService} from "./services/auth/token-storage.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  title = 'truespotFront';

  constructor(private token: TokenStorageService) { }

  ngOnInit() {

  }
  logout() {
    this.token.signOut();
    window.location.reload();
  }
}
