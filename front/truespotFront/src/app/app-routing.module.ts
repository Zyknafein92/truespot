import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {CreateTopoComponent} from "./components/topo/create-topo/create-topo.component";
import {SignInComponent} from "./components/auth/sign-in/sign-in.component";
import {LogoutComponent} from "./components/auth/logout/logout.component";
import {HomeComponent} from "./components/home/home.component";
import {ViewTopoComponent} from "./components/topo/view-topo/view-topo.component";
import {CreateAreaComponent} from "./components/area/create-area/create-area.component";
import {CreateRoadComponent} from "./components/road/create-road/create-road.component";
import {CreateUserComponent} from "./components/user/create-user/create-user.component";
import {ViewProfilComponent} from "./components/user/view-profil/view-profil.component";
import {UpdateAreaComponent} from "./components/area/update-area/update-area.component";


const appRoutes: Routes = [
  {path: 'sign-in', component: SignInComponent},
  {path: 'logout', component: LogoutComponent},
  {path: 'home', component: HomeComponent},
  {path: 'createUser', component: CreateUserComponent},
  {path: 'view-profil', component: ViewProfilComponent},
  {path: 'createArea', component: CreateAreaComponent},
  {path: 'createRoad', component: CreateRoadComponent},
  {path: 'createTopo', component:CreateTopoComponent},
  {path: 'sign-in', component: SignInComponent},
  {path: 'logout', component: LogoutComponent},
  {path: 'home', component: HomeComponent},
  {path: 'myprofil', component: ViewProfilComponent},
  {path: 'updateArea', component: UpdateAreaComponent},

  {
    path: 'topo',
    children: [
      {
        path: 'add-topo',
        component: CreateTopoComponent,
      },
      {
        path: 'list-topo',
        component: CreateTopoComponent,
      },
      {
        path: 'view-topo/:idRoad',
        component: ViewTopoComponent,
      },
      {
        path: 'area',
        children: [
          {
            path: 'add-area/:idTopo',
            component: CreateAreaComponent,
          },
        ]
      },
      {
        path: 'road',
        children: [
          {
            path: 'add-road/:idArea',
            component: CreateRoadComponent,
          },
        ]
      },
    ]
  },

  {
    path: '',
    redirectTo: '/topo/add-topo',
    pathMatch: 'full'
  },

  // {
  //   path: '',
  //   redirectTo: '/topo/create-spot',
  //   pathMatch: 'full'
  // },
  //
  // {
  //   path: '',
  //   redirectTo: '/topo/create-area',
  //   pathMatch: 'full'
  // },
  //
  // {
  //   path: '',
  //   redirectTo: '/topo/create-road',
  //   pathMatch: 'full'
  // }

];



@NgModule({
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})

export class AppRoutingModule {


}
